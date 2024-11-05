package io.marelso.encalhes.service

import jakarta.mail.internet.MimeMessage
import org.springframework.mail.SimpleMailMessage
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.mail.javamail.MimeMessageHelper
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Service
import java.util.*

@Service
class EmailService(private val mailSender: JavaMailSender) {
    companion object {
        private const val KEY_DAILY_TIMESTAMP = "0 20 23 * * ?"
    }

    @Scheduled(cron = KEY_DAILY_TIMESTAMP)
    fun sendEmail() {
        println("Sending email")
        val mimeMessage: MimeMessage = mailSender.createMimeMessage()
        val helper = MimeMessageHelper(mimeMessage, true)

        helper.setTo("alexandre.firmino@zerohora.com.br")
        helper.setSubject("Encalhe - ${Date()}")
        helper.setText(getEmailContent(), true)

        mailSender.send(mimeMessage)
    }

    private fun getEmailContent(): String {
        return """
    <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Vertical Text Column</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }

        .section {
            display: flex; /* Use flexbox for layout */
        }

        .vertical-column {
            writing-mode: vertical-lr;
            text-align: center;
            color: white;
            background-color: #0f4762;
            padding: 10px;
        }

        .table {
            display: flex;
            flex-direction: column; /* Stack rows vertically */
        }
    </style>
</head>
<body>
    <div class="section">
        <div class="vertical-column">
            <span>Capital</span>
        </div>
        <div class="table">
            <table style="border-collapse: collapse;">
                <thead>
                  <tr style="background-color: #0f4762; color: white;">
                    <th style="padding: 10px; text-align: center;">Período</th>
                    <th style="padding: 10px; text-align: center;">Recebido</th>
                    <th style="padding: 10px; text-align: center;">Concluido</th>
                  </tr>
                </thead>
                <tbody>
                    <tr>
                      <td style="padding-left: 10px; padding-right: 5px;">01 a 06/10</td>
                      <td style="text-align: center;">☑</td>
                      <td style="text-align: center;">☑</td>
                    </tr>
                    <tr>
                      <td style="padding-left: 10px; padding-right: 5px;">07 a 13/10</td>
                      <td style="text-align: center;">☑</td>
                      <td style="text-align: center;">☑</td>
                    </tr>
                    <tr>
                      <td style="padding-left: 10px; padding-right: 5px;">14 a 20/10</td>
                      <td style="text-align: center;">☑</td>
                      <td style="text-align: center;">☑</td>
                    </tr>
                    <tr>
                      <td style="padding-left: 10px; padding-right: 5px;">21 a 27/10</td>
                      <td style="text-align: center;">☑</td>
                      <td style="text-align: center;">☑</td>
                    </tr>
                    <tr>
                      <td style="padding-left: 10px; padding-right: 5px;">28 a 31/10</td>
                      <td style="text-align: center;">☑</td>
                      <td style="text-align: center;">☑</td>
                    </tr>
                </tbody>
              </table>
        </div>
    </div>
</body>
</html>
    """
    }
}