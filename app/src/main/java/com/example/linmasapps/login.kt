import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login) // Pastikan file XML sesuai

        // Tombol login
        val loginButton: Button = findViewById(R.id.loginButton) // Ganti dengan ID tombol di layout Anda
        loginButton.setOnClickListener {
            // Pindah ke halaman homepage
            val intent = Intent(this, Homepage::class.java)
            startActivity(intent)
            finish() // Tutup halaman login agar tidak bisa kembali
        }
    }
}

}
}