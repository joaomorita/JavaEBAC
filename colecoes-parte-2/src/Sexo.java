public enum Sexo {
    MASCULINO, FEMININO;

    public static Sexo paraString(String value) {
        if (value == null) return null;

        switch (value.trim().toLowerCase()) {
            case "masculino":
            case "m":
                return MASCULINO;

            case "feminino":
            case "f":
                return FEMININO;
            default:
                throw new IllegalArgumentException("Sexo inválido: " + value);
        }
    }
}
