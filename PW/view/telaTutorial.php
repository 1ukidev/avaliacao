<head>
    <link
    rel="stylesheet"
    href="style/swiper-bundle.min.css"
    />

    <script src="scripts/swiper-bundle.min.js"></script>
    <style>
        .swiper {
            width: 304px;
            height: 100%;
            border: 1px solid black;
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
            border: 1px solid black;
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
        }

        .swiper-slide img {
            display: block;
            width: 100%;
            height: 100%;
            object-fit: cover;
        }
    </style>
</head>
<body>
<div class="swiper mySwiper">
      <div class="swiper-wrapper">
        <div class="swiper-slide">Clique em "Ver registros", para visualizar a tela de materiais alugados.</div>
        <div class="swiper-slide">Clique em "Ver registros", para visualizar a tela de materiais alugados.</div>
        <div class="swiper-slide">Clique em "Ver registros", para visualizar a tela de materiais alugados.</div>
      </div>
      <div class="swiper-button-next"></div>
      <div class="swiper-button-prev"></div>
      <div class="swiper-pagination"></div>
    </div>

    <script src="scripts/jquery.js"></script>
    <script src="scripts/app.js"></script>
</body>