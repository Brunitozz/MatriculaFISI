/**
 * AsignaturasMatriculadas
 */
public class AsignaturasMatriculadas {
    private String _codigoAsignatura;
    private String _asignatura;
    private int _creditos;
    private int _seccion;
    private String _docente;
    public AsignaturasMatriculadas(String codigoAsignatura, String asignatura, int creditos, int seccion, String docente){
        _codigoAsignatura = codigoAsignatura;
        _asignatura = asignatura;
        _creditos = creditos;
        _seccion = seccion;
        _docente = docente;
    }

    /**
     * @return the _codigoAsignatura
     */
    public String getCodigoAsignatura() {
        return _codigoAsignatura;
    }

    /**
     * @param _codigoAsignatura the _codigoAsignatura to set
     */
    public void setCodigoAsignatura(String _codigoAsignatura) {
        this._codigoAsignatura = _codigoAsignatura;
    }

    /**
     * @return the _asignatura
     */
    public String getAsignatura() {
        return _asignatura;
    }

    /**
     * @param _asignatura the _asignatura to set
     */
    public void setAsignatura(String _asignatura) {
        this._asignatura = _asignatura;
    }

    /**
     * @return the _creditos
     */
    public int getCreditos() {
        return _creditos;
    }

    /**
     * @param _creditos the _creditos to set
     */
    public void setCreditos(int _creditos) {
        this._creditos = _creditos;
    }

    /**
     * @return the _seccion
     */
    public int getSeccion() {
        return _seccion;
    }

    /**
     * @param _seccion the _seccion to set
     */
    public void setSeccion(int _seccion) {
        this._seccion = _seccion;
    }

    /**
     * @return the _docente
     */
    public String getDocente() {
        return _docente;
    }

    /**
     * @param _docente the _docente to set
     */
    public void setDocente(String _docente) {
        this._docente = _docente;
    }
    
}