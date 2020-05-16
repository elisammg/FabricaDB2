package com.proyecto.fabrica.controller;

import com.proyecto.fabrica.service.SendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SendMailController {

    @Autowired
    private SendMailService mailService;

    @GetMapping("/sendmail")
    public String index(){
        return "sendmail";
    }

    @PostMapping("/mailsend")
    public String sendMail(@RequestParam("name") String name, @RequestParam("mail") String mail, @RequestParam("subject") String subject, @RequestParam("body") String body){

        String message = body +"\n\n Datos de contacto: " + "\nNombre: " + name + "\nE-mail: " + mail;
        mailService.sendMail("elisamargarita.2899@gmail.com",mail,subject,message);

        return "sendmail";
    }
}
