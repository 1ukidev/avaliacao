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

$("#excluir").click(() => {
    let lista = document.querySelectorAll(".registroBox");
    for(i = 0; i<lista.length; i++){
        const items = [].slice.call(lista[i].childNodes);
        let item;

        while(item = items.pop()) {
            if(item && item.checked) {
                dados.splice(i, 1);
                console.log(i)
                item.parentElement.remove();
            }
        };
        
    }
    
})