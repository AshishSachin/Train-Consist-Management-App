import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class train_consist_mngmt_appTest {

    @Test
    void testSearch_BogieFound() {
        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};

        assertTrue(train_consist_mngmt_app.linearSearch(arr, "BG309"));
    }

    @Test
    void testSearch_BogieNotFound() {
        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};

        assertFalse(train_consist_mngmt_app.linearSearch(arr, "BG999"));
    }

    @Test
    void testSearch_FirstElementMatch() {
        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};

        assertTrue(train_consist_mngmt_app.linearSearch(arr, "BG101"));
    }

    @Test
    void testSearch_LastElementMatch() {
        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};

        assertTrue(train_consist_mngmt_app.linearSearch(arr, "BG550"));
    }

    @Test
    void testSearch_SingleElementArray() {
        String[] arr = {"BG101"};

        assertTrue(train_consist_mngmt_app.linearSearch(arr, "BG101"));
    }
}