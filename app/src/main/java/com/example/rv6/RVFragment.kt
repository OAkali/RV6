package com.example.rv6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.rv6.databinding.FragmentRVBinding


class RVFragment : Fragment() {
    private lateinit var binding: FragmentRVBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRVBinding.inflate(layoutInflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Создаем список мультфильмов
        val cartoons = listOf(
            "1 Шрек 1",
            "2 Корпорация монстров",
            "3 Человек паук",
            "4 Рататуй",
            "5 Мадагаскар",
            "6 Головоломка",
            "7 Валл-и",
            "8 Жили-были пёсь",
            "9 Босс-молокосос",
            "10 Вверх",
            "11 Касавица и Чудовищя",
            "12 Король лев",
            "13 Душа",
            "14 В поисках Немо",
            "15 Три богатыря и \n Конь на троне",
            "16 Тайна Коко",
            "17 Холодное сердце",
            "18 Кот в сапогах",
            "19 Кунг-фу панда",
            "20 Моана",
          

            )

        // Создаем и настраиваем адаптер для RecyclerView
        val adapter = CartoonsAdapter(cartoons)
        binding.recyclerView.layoutManager = LinearLayoutManager(context)
        binding.recyclerView.adapter = adapter

    }


}