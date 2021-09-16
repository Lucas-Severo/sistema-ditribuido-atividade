package db;

import java.util.List;

import Utils.Usuario;

public class AlunosDTO {
    
    private static List<Usuario> alunosMatriculados = List.of(
			Usuario.builder().matricula("1234").senha("12345678").nome("Lucas").sobrenome("Severo").build(),
			Usuario.builder().matricula("3451").senha("12335778a").nome("João").sobrenome("Silva").build());

    public static List<Usuario> obterAlunosMatriculados() {
        return alunosMatriculados;
    }

}