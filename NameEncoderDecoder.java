class NameEncoderDecoder{
    public String encode(String name){
        name = "NOTFORYOU" + name + "YESNOTFORYOU";
        return name
               .replace("e", "1")
               .replace("u", "2")
               .replace("i", "3")
               .replace("o", "4")
               .replace("a", "5");
    }
    public String decode(String name){
        return name
               .replace("YESNOTFORYOU", "")
               .replace("NOTFORYOU", "")
               .replace("1", "e")
               .replace("2", "u")
               .replace("3", "i")
               .replace("4", "o")
               .replace("5", "a");
      
    }
}
