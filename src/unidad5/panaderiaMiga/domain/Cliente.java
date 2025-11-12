package unidad5.panaderiaMiga.domain;

    public record Cliente(String nombre, String telefono) {
        public Cliente {
            if (nombre == null || nombre.isBlank()) {
                throw new IllegalArgumentException("el nombre del cliente es obligatorio");
            }
            if (telefono == null || telefono.isBlank()){
                throw new IllegalArgumentException("el telefono del cliente es obligatorio");
            }
        }
}
