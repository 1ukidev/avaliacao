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

$("#btn1").click((e) => {
    e.preventDefault();
    mudarTela("telaTutorial.php");
})

$("#btn2").click((e) => {
    e.preventDefault();
    mudarTela("telaInicio.php");
})

$("#excluir").click(() => {
    let lista = document.querySelectorAll(".registroBox");
    let arrayItens = [];
    for(i = 0; i<lista.length; i++){
        const items = [].slice.call(lista[i].childNodes);
        let item;

        while(item = items.pop()) {
            if(item && item.checked) {
                arrayItens.push(i)
                item.parentElement.remove();
            }
        };
    }
    dados = dados.filter((value, index) => {
        return arrayItens.indexOf(index) == -1;
    })
})

var swiper = new Swiper(".mySwiper", {
    slidesPerView: 1,
    spaceBetween: 30,
    keyboard: {
      enabled: true,
    },
    pagination: {
      el: ".swiper-pagination",
      clickable: true,
    },
    navigation: {
      nextEl: ".swiper-button-next",
      prevEl: ".swiper-button-prev",
    },
  });