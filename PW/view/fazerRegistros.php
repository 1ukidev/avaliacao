<div class="fazerRegistros">
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
    <div class="fazerRegistros-container">
        <div class="img-container">
            <img src="imagens/vetorfoda.png" alt="">
        </div>
        <div class="form-wrapper">
            <form method="post" action="../model/dados.php">
                <div class="professor-wrapper">
                    <label for="nomeProfessor">Professor:</label>
                    <select name="nomeProfessor" id="nomeProfessor">
                        <option value="Alcides">Alcides</option>
                        <option value="Anderson">Anderson</option>
                        <option value="Wendel">Wendel</option>
                        <option value="Andrea">Andrea</option>
                        <option value="Clemilton">Clemilton</option>
                        <option value="Daniel">Daniel</option>
                        <option value="Neto">Neto</option>
                        <option value="Giselly">Giselly</option>
                        <option value="Juscelio">Juscelio</option>
                        <option value="Mozean">Mozean</option>
                        <option value="Gadelha">Gadelha</option>
                        <option value="Robson">Robson</option>
                        <option value="Rodrigo">Rodrigo</option>
                        <option value="Rossana">Rossana</option>
                        <option value="Zilma">Zilma</option>
                    </select>
                </div>
                <hr>
                <div class="dia-wrapper">
                    <label for="dia">Dia:</label>
                    <select name="dia" id="dia">
                        <option value="segunda">segunda</option>
                        <option value="terça">terça</option>
                        <option value="quarta">quarta</option>
                        <option value="quinta">quinta</option>
                        <option value="sexta">sexta</option>
                    </select>
                </div>
                <hr>
                <div class="horario-wrapper">
                    <label for="horario">Horario:</label>
                    <select name="horario" id="horario">
                        <option value="07:00/07:50">07:00/07:50</option>
                        <option value="07:50/08:50">07:50/08:50</option>
                        <option value="09:10/10:00">09:10/10:00</option>
                        <option value="10:00/10:50">10:00/10:50</option>
                        <option value="10:50/11:40">10:50/11:40</option>
                        <option value="13:00/13:50">13:00/13:50</option>
                        <option value="13:50/14:40">13:50/14:40</option>
                        <option value="15:00/15:50">15:00/15:50</option>
                        <option value="15:50/16:40">15:50/16:40</option>
                    </select>
                </div>
                <hr>
                <div class="equipamento-wrapper">
                    <label for="equipamento">Equipamento:</label>
                    <select name="equipamento" id="equipamento">
                        <option value="projetor">projetor</option>
                        <option value="notebook">notebook</option>
                        <option value="caixa de som">caixa de som</option>
                    </select>
                </div>
                <input type="submit" value="enviar" id="fazendoRegistros">
            </form>
        </div>
    </div>
</div>
<script src="scripts/jquery.js"></script>
<script src="scripts/app.js"></script>
<script src="../control/atualizarDados.js"></script>