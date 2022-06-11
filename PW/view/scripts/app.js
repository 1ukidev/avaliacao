function mudarTela(url){
    $.ajax({
        url: url,
        success: (e) => {
            $(".container").children().hide();
            $(".container").html(e);
        }
    })
}

$("#fazerRegistros").click((e) => {
    e.preventDefault();
    mudarTela("fazerRegistros.php");
})

$(".top_bar-icon").click((e) => {
    e.preventDefault();
    mudarTela("telaInicio.php");
})

$("#verRegistros").click((e) => { 
    e.preventDefault();
    mudarTela("verRegistros.php");
});

$("#btn2").click((e) => {
    e.preventDefault();
    mudarTela("telaInicio.php");
})