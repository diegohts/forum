package br.com.alura.forum.service

import br.com.alura.forum.model.Curso
import br.com.alura.forum.model.Topico
import br.com.alura.forum.model.Usuario
import org.springframework.stereotype.Service
import java.util.*

@Service
class TopicoService(private var topicos: List<Topico>) {


    // dados em memória
    init {
        val topico1 = Topico(
            id = 1,
            titulo = "Dúvida Kotlin",
            mensagem = "Variaveis no Kotlin",
            curso = Curso(
                id = 1,
                nome = "Kotlin",
                categoria = "Programação"
            ),
            autor = Usuario(
                id = 1,
                nome = "Fulano da silva",
                email = "fulano@meial.com"
            )
        )

        val topico2 = Topico(
            id = 2,
            titulo = "Dúvida Kotlin 2",
            mensagem = "Variaveis no Kotlin 2",
            curso = Curso(
                id = 1,
                nome = "Kotlin",
                categoria = "Programação"
            ),
            autor = Usuario(
                id = 1,
                nome = "Fulano da silva",
                email = "fulano@meial.com"
            )
        )

        val topico3 = Topico(
            id = 3,
            titulo = "Dúvida Kotlin 3",
            mensagem = "Variaveis no Kotlin 3",
            curso = Curso(
                id = 1,
                nome = "Kotlin",
                categoria = "Programação"
            ),
            autor = Usuario(
                id = 1,
                nome = "Fulano da silva",
                email = "fulano@meial.com"
            )
        )

        topicos = Arrays.asList(topico1, topico2, topico3)
    }

    fun listar(): List<Topico> {
        return topicos
    }

    fun buscarPorId(id: Long): Topico {

        return topicos.stream().filter({
            t -> t.id == id
        }).findFirst().get()
    }


}