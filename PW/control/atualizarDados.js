$("#fazendoRegistros").click((e) => { 
    e.preventDefault();
    let formData = new FormData();
    formData.append("nomeProfessor", $("#nomeProfessor").val());
    formData.append("dia", $("#dia").val());
    formData.append("horario", $("#horario").val());
    formData.append("equipamento", $("#equipamento").val());
    $.ajax({
        url: "../model/dados.php",
        type: "POST",
        data: formData,
        processData: false,
        contentType: false,
        success: (e) => {
            //alertify.success('registro feito com sucesso');
            $(".container").html(e);
        }
    })
});