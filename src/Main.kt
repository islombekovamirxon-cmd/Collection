//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    /// Collection -> bitta o'zgaruvchida qiymatlarni saqlovchi obyekt
    /// Collection iki qismga bo'linadi
    /// 1 - > Immutable (faqat o'qiydi,qo'shish,o'zgartirish,o'chirish mumkin emas)
    /// 2 - > Mutable (o'zgartirish,qo'shish,o'chirish,va tayyor funksiyalar)
    /// 3 turga bo'linadi
    /// List - > Elementlar takror bo'lishi mumkin
    /// Set - > Elementlar takror bo'lmaydi, faqat noyob bo'ladi
    /// Map - > kalit-qiymat juftliklari

    /// List example
//    val readOnlyFruits = listOf("apple", "orange", "grape")
//    val mutableFruits = mutableListOf("apple", "orange", "grape")

    /// Index bo'yicha o'qish
//    println(readOnlyFruits[0])
//    println(mutableFruits.get(0))


    //    readOnlyFruits.
//    mutableFruits.add("banana")
//    mutableFruits.remove("apple")
//    mutableFruits.removeAt(0)
//    mutableFruits.set(0, "kiwi")
//    mutableFruits[0] = "kiwi"
//    mutableFruits.add("pear")
//    mutableFruits.clear()/// tozalaydi
//    mutableFruits.sort() /// tartiblaydi
//    println(mutableFruits)

    val group = mutableListOf<Person>(
        Person("Xamit", 15, "Aqchako'l"),
        Person("Navro'z", 15, "Navoiy")
    )
    println(group)
    group.sortBy { it.name }
    println(group.size)
}