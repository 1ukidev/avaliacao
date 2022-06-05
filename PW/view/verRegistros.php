<div class="verRegistros">
    <div class="top-bar">
        <img class="top_bar-icon" src="imagens/icon 1.png" alt="icone do programa">
        <div class="menu">
            <ul class="menu-lista">
                <li class="menu_lista-itens" id="verRegistros">ver registros</li>
                <li class="menu_lista-itens" id="fazerRegistros">fazer registros</li>
                <li class="menu_lista-itens" id="ajuda">ajuda</li>
            </ul>
        </div>
    </div>
    <div class="verRegistros-container">
        <?php
            include '../model/dados.php';
        ?>
        <!--<div class="registroBox">
            <div class="registroBox-texto">
                <span>Nome do professor</span>
                <span>Equipamento</span>
                <span>Horário</span>
                <span>Dia</span>
            </div>
            <input type="checkbox" name="registroBox-checkbox" class="registroBox-checkbox">
        </div>-->
    <button id="excluir">excluir</button>
    </div>
    <img src="imagens/gear-solid 1.png" alt="configurações" id="iconConfig">
</div>
<script src="scripts/jquery.js"></script>
<script src="scripts/alertify.min.js"></script>
<script src="scripts/app.js"></script>