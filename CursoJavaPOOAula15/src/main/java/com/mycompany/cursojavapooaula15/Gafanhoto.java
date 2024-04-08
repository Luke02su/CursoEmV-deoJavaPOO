package com.mycompany.cursojavapooaula15;

public class Gafanhoto extends Pessoa {
    private boolean login;
    private int totAssistiado;
    
    @Override
    protected void ganharExp(int experiencia) {
        super.setExperiencia(this.getExperiencia() + experiencia);
    }
    
    public void viuMaisUm() {
        this.setTotAssistiado(this.getTotAssistiado() + 1);
    }

    public boolean isLogin() {
        return login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }

    public int getTotAssistiado() {
        return totAssistiado;
    }

    public void setTotAssistiado(int totAssistiado) {
        this.totAssistiado = totAssistiado;
    }
}
