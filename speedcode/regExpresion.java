package speedcode;

class exp
{
    String code = "ACGGGATTATGTAGCCCCTCGAUAGCCGCCCUCGAG";

    String codeBreak = code.replaceAll("[ATG]", "MET");

    int index = code.indexOf("ATG");
    
    
}
    
