class Estatistica {
    int CodCidade;
    String CityName;
    int QtdAcidentes;
    
    Estatistica(){
        this(0," ",0);
    }
    
    Estatistica(int CityCode, String PCityName, int PQtdAcidentes){
        CodCidade = CityCode;
        CityName = PCityName;
        QtdAcidentes = PQtdAcidentes;
    }
    
}


