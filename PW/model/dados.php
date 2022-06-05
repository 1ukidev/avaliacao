<?php
    include 'Registro.php';
    
    $dados = array();

    function criarDados(){
        $registro = new Registro($_POST["nomeProfessor"], $_POST["dia"], $_POST["horario"], $_POST["equipamento"]);
        return $registro;
    }

    $dados[] = criarDados();
    
    var_dump($dados);
?>