import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.R

class Homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homepage) // Pastikan file XML sesuai

        // Tombol untuk pindah ke halaman scan
        val scanButton: Button = findViewById(R.id.scan) // Ganti dengan ID tombol di layout Anda
        scanButton.setOnClickListener {
            val intent = Intent(this, Scan::class.java)
            startActivity(intent)
        }
    }
}
