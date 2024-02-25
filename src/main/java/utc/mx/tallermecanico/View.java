package utc.mx.tallermecanico;

public enum View {
    //Aqui van las rutas de los vistas
    Selection("selection-view.fxml"), ;

    private final String FileName;

    View(String fileName) {
        FileName = fileName;
    }

    public String getFileName() {
        return FileName;
    }
}
