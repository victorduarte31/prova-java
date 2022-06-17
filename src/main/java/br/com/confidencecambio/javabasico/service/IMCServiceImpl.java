package br.com.confidencecambio.javabasico.service;

import br.com.confidencecambio.javabasico.service.impl.IMCService;
import br.com.confidencecambio.javabasico.utils.VerificaNumerosUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class IMCServiceImpl implements IMCService {


    @Override
    public double calculoImc(String peso, String altura) {

        if ((validaCampos(peso) && validaCampos(altura))) {
            double p = Double.parseDouble(peso);
            double a = Double.parseDouble(altura);

            if ((p <= 0) || (a <= 0)) {
                throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, "Valores de peso ou altura não podem ser 0 ou negativos");
            }

            return p / (a *a);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, "Valores de peso ou altura incorretos");
        }
    }


    private boolean validaCampos(String valor) {
        return VerificaNumerosUtils.verificaCampos(valor);
    }
}
