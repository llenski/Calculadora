package com.dojo.tdd.Taskmanager;

import com.dojo.tdd.Taskmanager.model.Calculadora;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {
    private final Calculadora calculadora = new Calculadora();

    @Operation(summary = "Soma dois números")
    @GetMapping("/somar")
    public Integer somar(@Parameter(description = "Primeiro número") @RequestParam Integer num1,
                         @Parameter(description = "Segundo número") @RequestParam Integer num2) {
        return calculadora.somar(num1, num2);
    }

    @Operation(summary = "Subtrai dois números")
    @GetMapping("/subtrair")
    public Integer subtrair(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calculadora.subtrair(num1, num2);
    }

    @Operation(summary = "Multiplica dois números")
    @GetMapping("/multiplicar")
    public Integer multiplicar(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calculadora.multiplicar(num1, num2);
    }

    @Operation(summary = "Divide dois números")
    @GetMapping("/dividir")
    public Integer dividir(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calculadora.dividir(num1, num2);
    }

    @Operation(summary = "Calcula a potência de um número")
    @GetMapping("/potencia")
    public Integer potencia(@RequestParam Integer base, @RequestParam Integer expoente) {
        return calculadora.potencia(base, expoente);
    }

    @Operation(summary = "Calcula a raiz quadrada de um número")
    @GetMapping("/raiz-quadrada")
    public Integer raizQuadrada(@RequestParam Integer numero) {
        return calculadora.raizQuadrada(numero);
    }
}

