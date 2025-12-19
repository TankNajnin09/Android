fun main()
{
    val mutablecity = mutableListOf("Amreli","Rajkot","Surat")

    mutablecity.add("Bhavnagar")
    mutablecity.add("Jamnagar")

    println("Mutable list of city after add two city : ")
    for(city in mutablecity)
    {
        println(city)
    }
}