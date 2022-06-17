package br.com.confidencecambio.javabasico.controller;


import br.com.confidencecambio.javabasico.service.IMCServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/imc")
@RequiredArgsConstructor
public class IMCController {

    private final IMCServiceImpl imcService;

    @GetMapping
    ResponseEntity<Double> getCalculoImc(@RequestParam(value = "peso", required = true) String peso,
                                             @RequestParam(value = "altura", required = true) String altura) {

        return new ResponseEntity<>(imcService.calculoImc(peso, altura), HttpStatus.OK);
    }


}
