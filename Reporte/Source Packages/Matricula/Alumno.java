public class Alumno {
    private int _codigo;
    private String _nombre;
    private String _facultad;
    private String _escuela;
    private String _especialidad;
    private int _plan;
    private String _periodo;
    
    public Alumno (int codigo, String nombre, String facultad, String escuela, String especialidad, int plan, String periodo){
    _codigo = codigo;
    _nombre = nombre;
    _facultad = facultad;
    _escuela = escuela;
    _especialidad = especialidad;
    _plan = plan;
    _periodo = periodo;
    }
    /**
     * @return the _codigo
     */
    public int getCodigo() {
        return _codigo;
    }

    /**
     * @param _codigo the _codigo to set
     */
    public void setCodigo(int _codigo) {
        this._codigo = _codigo;
    }

    /**
     * @return the _nombre
     */
    public String getNombre() {
        return _nombre;
    }

    /**
     * @param _nombre the _nombre to set
     */
    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    /**
     * @return the _facultad
     */
    public String getFacultad() {
        return _facultad;
    }

    /**
     * @param _facultad the _facultad to set
     */
    public void setFacultad(String _facultad) {
        this._facultad = _facultad;
    }

    /**
     * @return the _escuela
     */
    public String getEscuela() {
        return _escuela;
    }

    /**
     * @param _escuela the _escuela to set
     */
    public void setEscuela(String _escuela) {
        this._escuela = _escuela;
    }

    /**
     * @return the _especialidad
     */
    public String getEspecialidad() {
        return _especialidad;
    }

    /**
     * @param _especialidad the _especialidad to set
     */
    public void setEspecialidad(String _especialidad) {
        this._especialidad = _especialidad;
    }

    /**
     * @return the _plan
     */
    public int getPlan() {
        return _plan;
    }

    /**
     * @param _plan the _plan to set
     */
    public void setPlan(int _plan) {
        this._plan = _plan;
    }

    /**
     * @return the _periodo
     */
    public String getPeriodo() {
        return _periodo;
    }

    /**
     * @param _periodo the _periodo to set
     */
    public void setPeriodo(String _periodo) {
        this._periodo = _periodo;
    }
}
