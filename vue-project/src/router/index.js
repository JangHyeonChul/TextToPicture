import { createWebHistory, createRouter } from 'vue-router'
import AppCreate from "@/views/AppCreate.vue";
import AppLounge from '@/views/AppLounge.vue';
import AppAnswer from "@/views/AppAnswer.vue";


const routes = [
    {
        path: '/lounge',
        name: 'AppLounge',
        component: AppLounge,
    },
    {
        path: '/create',
        name: 'AppCreate',
        component: AppCreate,
    },
    {
        path: '/answer',
        name: 'AppAnswer',
        component: AppAnswer,
    },
]

const router = createRouter({
    history: createWebHistory(),
    routes
})

export default router