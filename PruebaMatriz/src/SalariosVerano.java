public class SalariosVerano {
    private double[][] salarios;

    public SalariosVerano(double[][] salarios) {
        this.salarios = salarios;
    }

    public double[][] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[][] salarios) {
        this.salarios = salarios;
    }

    public int personaQueMasGano() {
        double maxTotal = 0;
        int personaIndex = -1;
        for (int i = 0; i < salarios.length; i++) {
            double totalPersona = 0;
            for (int j = 0; j < salarios[i].length; j++) {
                totalPersona += salarios[i][j];
            }
            if (totalPersona > maxTotal) {
                maxTotal = totalPersona;
                personaIndex = i;
            }
        }
        return personaIndex;
    }

    public int anoConSalarioMasAlto() {
        double maxSalario = 0;
        int anoIndex = -1;
        for (int j = 0; j < salarios[0].length; j++) {
            for (int i = 0; i < salarios.length; i++) {
                if (salarios[i][j] > maxSalario) {
                    maxSalario = salarios[i][j];
                    anoIndex = j;
                }
            }
        }
        return anoIndex;
    }

    public double totalGanado() {
        double total = 0;
        for (int i = 0; i < salarios.length; i++) {
            for (int j = 0; j < salarios[i].length; j++) {
                total += salarios[i][j];
            }
        }
        return total;
    }

    public void imprimirEstadisticas() {
        System.out.println("Persona que más ganó: Persona " + (personaQueMasGano() + 1));
        System.out.println("Año con salario más alto: Año " + (anoConSalarioMasAlto() + 1));
        System.out.println("Monto total ganado: " + totalGanado());
    }
}
