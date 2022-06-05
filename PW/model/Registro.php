<?php
    class Registro {
        public $nomeProfessor;
        public $dia;
        public $horario;
        public $equipamento;

        public function __construct($nProfessor, $d, $h, $equip){
            $this->nomeProfessor = $nProfessor;
            $this->dia = $d;
            $this->horario = $h;
            $this->equipamento = $equip;
        }
    }
?>