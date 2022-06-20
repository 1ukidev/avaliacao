<head>
    <link
    rel="stylesheet"
    href="style/swiper-bundle.min.css"
    />

    <script src="scripts/swiper-bundle.min.js"></script>
    <style>
        .slide-container {
            width: 100%;
            height: 100%;
            background-color: var(--cor-5);
            border-radius: 10px;
        }
        .swiper {
            width: 304px;
            height: 100%;
            padding: 0 58px;
        }

        .swiper-wrapper {
            margin: auto;
            position: relative;
            width: 100%;
            height: 100%;
            z-index: 1;
            display: flex;
            transition-property: transform;
            box-sizing: content-box;
            align-items: center;
        }

        .swiper-slide {
            text-align: center;
            font-size: 18px;
            background: #fff;
            display: -webkit-box;
            display: -ms-flexbox;
            display: -webkit-flex;
            display: flex;
            -webkit-box-pack: center;
            -ms-flex-pack: center;
            -webkit-justify-content: center;
            justify-content: center;
            -webkit-box-align: center;
            -ms-flex-align: center;
            -webkit-align-items: center;
            align-items: center;
            height: 80%;
            border-radius: 10px;
        }

        .slide-wrapper {
            width: 100%;
            height: 100%;
            border-radius: 10px;
            display: -webkit-box;
            display: -ms-flexbox;
            display: -webkit-flex;
            display: flex;
            flex-direction: column;
            -webkit-box-pack: center;
            -ms-flex-pack: center;
            -webkit-justify-content: center;
            justify-content: center;
            -webkit-box-align: center;
            -ms-flex-align: center;
            -webkit-align-items: center;
            align-items: center;
            transition: border-radius 0.5s cubic-bezier(0.175, 0.885, 0.32, 1.275);
            box-shadow: inset 0 -3em 3em rgba(0,0,0,0.1),
             0 0  0 2px rgb(190, 190, 190),
             0.3em 0.3em 1em rgba(0,0,0,0.3);
        }

        .swiper-button-next {
            color: var(--cor-1);
            font-weight: bolder;
            text-shadow: 0 0 35px black;
        }

        .swiper-button-prev {
            color: var(--cor-1);
            font-weight: bolder;
            text-shadow: 0 0 35px black;
        }

        .swiper-horizontal>.swiper-pagination-bullets .swiper-pagination-bullet, .swiper-pagination-horizontal.swiper-pagination-bullets .swiper-pagination-bullet {
            background-color: var(--cor-1);
            margin: 4px;
            border: 1px solid black;
        }

        #menuInicio {
            text-decoration: underline;
            color: var(--cor-6);
            cursor: pointer;
        }
    </style>
</head>
<body>
    <div class="slide-container">
        <div class="swiper mySwiper">
          <div class="swiper-wrapper">
            <div class="swiper-slide">
                <div class="slide-wrapper">Clique em "Ver registros", para visualizar a tela de materiais alugados.</div>
            </div>
            <div class="swiper-slide">
                <div class="slide-wrapper">Clique em "Fazer registros", para visualizar a tela de fazer aluguel.</div>
            </div>
            <div class="swiper-slide">
                <div class="slide-wrapper">Clique em "Ajuda", para visualizar esta mesma tela.<br><br><span id="menuInicio">ir para tela inicial</span></div>
            </div>
          </div>
          <div class="swiper-button-next"></div>
          <div class="swiper-button-prev"></div>
          <div class="swiper-pagination"></div>
        </div>
    </div>

    <script src="scripts/jquery.js"></script>
    <script src="scripts/app.js"></script>
</body>