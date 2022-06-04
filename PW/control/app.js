console.log($(".container").children());
$("#fazerRegistros").click(() => {
    $.ajax({
        url: "fazerRegistros.php",
        success: (e) => {
            $(".menuInicial").hide();
            $(".container").html(e);
        }
    })
})

$("#fazendoRegistros").click(function (e) { 
    e.preventDefault();
    $.ajax({
        url: "verRegistros",
        success: (e) => {
            $(".fazerRegistros").hide();
            $(".container").html(e);
        }
    })
});

$(".top_bar-icon").click(() => {
    $.ajax({
        url: "telaInicio.php",
        success: (e) => {
            $(".container").html(e);
        }
    })
})

$("#verRegistros").click(function (e) { 
    e.preventDefault();
    $.ajax({
        url: "verRegistros.php",
        success: (e) => {
            $(".container").children().hide();
            $(".container").html(e);
        }
    })
});