package me.dio.desafio1.kt

enum class Nivel { BASICO, INTERMEDIARIO, AVANÇADO }

data class Usuario(val nome: String, val id: Int)
data class ConteudoEducacional(val nome: String, val duracao: Int, val nivel: Nivel, val avaliacao: Int)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {
    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    val user0: Usuario = Usuario("user0", 0)
    val kotlin: ConteudoEducacional = ConteudoEducacional("kotlin", 20, Nivel.BASICO, 5)
    val android_studio: ConteudoEducacional = ConteudoEducacional("android studio", 15, Nivel.INTERMEDIARIO, 4)
    val android_developer: Formacao = Formacao("android developer", listOf(android_studio, kotlin))
    
    android_developer.matricular(user0)
    println(android_developer)
}
