fun main() {
    val s = readLine()!!
    if (s.length == 8) {
        val s1 = s.substring(0,1)
        val s2 = s.substring(1,7)
        val s3 = s.substring(7,8)

        if (s2.filter { it in 'A'..'Z' || it in 'a' .. 'z'} == "") {
            if (
                s1 >= "A" && s1 <= "Z" &&
                s2 >= "100000" && s2 <= "999999" &&
                s3 >= "A" && s3 <= "Z"
            ) {
                println("Yes")
            } else {
                println("No")
            }
        } else {
            println("No")
        }
    } else {
        println("No")
    }
}