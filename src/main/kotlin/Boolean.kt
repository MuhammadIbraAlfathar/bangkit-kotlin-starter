fun main(){
    val now = 10
    val officeClose = 20
    val officeOpen = 8

    val office = now >= officeOpen && now <= officeClose //true

    val openOrNo = if (office){
        "Open"
    } else{
        "Close"
    }

    println(openOrNo)
}