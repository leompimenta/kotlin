fun main() {
//chamando cada função
    forConvecional(); println("\n") //printa numeros de 0 a 20, de 1 em 1
    downTo(); println("\n") //printa numeros de 20 a 0, de maneira descrescente
    until(); println("\n") //contará de 0 a 20, porém ele para no 20 pois quando atingiu o limite, saiu do loop
    step(2); println("\n")//contará os numeros de 0 a 20, mas de 2 em 2 (foi passado 2 como parâmetro)
    letter() //adiciona a string "Kotlin" ao array sArray, percorre o array e printa uma letra de cada vez transformando em upperCase (print(l.toUpperCase()) e adiciona um espaço entre as letras (+ " ")
}
fun forConvecional(){
    for(i in 0..20){
        print("$i ")
    }
}
fun downTo(){
    for(i in 20 downTo 0){
        print("$i ")
    }
}
fun until(){
    for(i in 0 until 20){
        print("$i ")
    }
}
fun step(num:Int){
    for(i in 0..20 step num){
        print("$i ")
    }
}
fun letter(){
    val sArray = "Kotlin"
    for(l in sArray){
        print(l.toUpperCase()+ " ")
    }  // ao invés do for convencional percorrendo o array, poderia ter usado o forEach. ficaria: sArray.forEach{ l -> print(l + " ")}
}
