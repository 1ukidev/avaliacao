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
<script>
    $(() => {
        let formData = new FormData();
        formData.append("dados", <?php $dados ?>);
        $.ajax({
            url: "../view/verRegistros.php",
            type: "POST",
            data: formData,
            processData: false,
            contentType: false,
            success: (e) => {
                alert("masssa");
            }
        })
    })
</script>