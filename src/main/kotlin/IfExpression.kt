fun main(){
    var now = 7
    var officeHour = 20

    var office = if(now > officeHour){
        "Closed"
    } else {
        "Open"
    }

    println(office)
}