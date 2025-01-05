import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class HalamanAwal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halamanawal) // Pastikan file XML sesuai

        // Pindah ke halaman login setelah 3 detik menggunakan coroutine
        lifecycleScope.launch {
            delay(3000) // Tunggu selama 3 detik
            val intent = Intent(this@HalamanAwal, Login::class.java)
            startActivity(intent)
            finish() // Tutup halaman ini agar tidak bisa kembali
        }
    }
}
