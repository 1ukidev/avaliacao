<?php
    include '../model/Registro.php';
    $registro = new Registro($_POST["nomeProfessor"], $_POST["dia"], $_POST["horario"], $_POST["equipamento"]);

?>
<script>
    $(() => {
        let dados = [
            '<?php echo $registro->nomeProfessor ?>',
            '<?php echo $registro->dia ?>',
            '<?php echo $registro->horario ?>',
            '<?php echo $registro->equipamento ?>',
        ]
        let formData = new FormData();
        formData.append("dados", dados);
        $.ajax({
            url: "../view/verRegistros.php",
            type: "POST",
            data: formData,
            processData: false,
            contentType: false,
            success: (e) => {
                $(".container").html(e);
            }
        })
    })
</script>