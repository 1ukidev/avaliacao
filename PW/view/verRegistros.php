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
            if(isset($_POST["dados"])){
                $dadosBruto = $_POST["dados"];
            } else {
                $dadosBruto = "";
            }
        /*
            $arr = explode(",", $dadosBruto);
            $dados[] = $arr;
            var_dump($dados);
        */
        ?>

        <script>
            string = '<?php echo $dadosBruto ?>';;
            if(string != ""){
                arr = string.split(",");
                dados.push(arr)
            }
            for(let i=0; i<dados.length; i++){
                $(".verRegistros-container").append(`
                <div class="registroBox">
                    <div class="registroBox-texto">
                    </div>
                    <input type="checkbox" class="registroBox-checkbox">
                </div>`);
                for(let a=0; a<4; a++){
                    let span = document.createElement('span');
                    span.appendChild(document.createTextNode(dados[i][a]));
                    document.querySelectorAll(".registroBox-texto")[i].appendChild(span);
                }
            }
        </script>
    <button id="excluir">excluir</button>
    </div>
</div>
<script src="scripts/jquery.js"></script>
<script src="scripts/app.js"></script>