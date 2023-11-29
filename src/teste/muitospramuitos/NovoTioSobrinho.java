package teste.muitospramuitos;

import infra.DAO;
import modelo.muitosparamuitos.Sobrinho;
import modelo.muitosparamuitos.Tio;

public class NovoTioSobrinho {
    public static void main(String[] args) {

        Tio tia1 = new Tio("Maria");
        Tio tio2 = new Tio("João");

        Sobrinho sobrinho1 = new Sobrinho("Junior");
        Sobrinho sobrinha2 = new Sobrinho("Ana");

        tia1.getSobrinhos().add(sobrinho1);
        sobrinho1.getTios().add(tia1);

        tia1.getSobrinhos().add(sobrinha2);
        sobrinha2.getTios().add(tia1);

        tio2.getSobrinhos().add(sobrinho1);
        sobrinho1.getTios().add(tio2);

        tio2.getSobrinhos().add(sobrinha2);
        sobrinha2.getTios().add(tio2);

        DAO<Object> dao = new DAO<>();
        dao.abrirT()
                .incluirT(tia1)
                .incluirT(tio2)
                .incluirT(sobrinho1)
                .incluirT(sobrinha2)
                .fecharT()
                .fechar();
    }
}
