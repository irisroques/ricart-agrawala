public enum Estado {
    /**
     * Enum para registrar o estado de um processo no algoritmo
     * ricart e agrawala.
     * Released = está fora da sessão crítica
     * Wanted = querendo entrar na sessão crítica
     * Held = está na sessão crítica
     */
    RELEASED, WANTED, HELD;
}