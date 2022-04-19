package br.com.aulaspuc.triangle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.aulaspuc.triangle.databinding.ActivityMainBinding

/***
 * Terminar o programa:
 *
 * Criar uma function chamada verifyTriangle (onCall) - que ao ser chamada
 * verifique se 3 lados fornecidos formam um triangulo.
 * E, toda vez que ela for invocada com sucesso (os 3 parametros fornecidos no data)
 * armazene o resultado numa collection "results" do Firestore.
 * Cada documento resultado deve ter o formato de exemplo:
 * {
 *  "triangleType": "Equilatero",
 *  "a": 10,
 *  "b": 10,
 *  "c": 10
 * }
 * Se não formar triangulo, gravar no firestore, por exemplo:
 * {
 *  "triangleType": "NONE",
 *  "a": 0,
 *  "b": 0,
 *  "c": 0
 * }
 *
 * Lembre-se de adicionar o google-services.json no módulo;
 *
 * Adicionar as dependências do firebase, bom e functions;
 *
 * Implementar a chamada da callable function.
 *
 * Ao clicar no botão: Verificar, invocar a function e obter o retorno.
 * Mostre na tela como quiser.
 *
 */
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}