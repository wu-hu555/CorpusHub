<template >
    <div class="grid-container">
        <div class="navbar bg-base-300 shadow-[4px_4px_10px_#00000029]">
            <div class="navbar-start">
                <div class="dropdown">
                    <div tabindex="0" role="button" class="btn btn-ghost btn-circle">
                        <svg xmlns="http://www.w3.org/2000/svg" class="h-5 w-5" fill="none" viewBox="0 0 24 24"
                            stroke="currentColor">
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                d="M4 6h16M4 12h16M4 18h7" />
                        </svg>
                    </div>
                    <ul tabindex="0"
                        class="menu menu-sm dropdown-content bg-base-100 rounded-box z-[1] mt-3 w-52 p-2 shadow">
                        <li><a>Homepage</a></li>
                        <li><a>Portfolio</a></li>
                        <li><a>About</a></li>
                    </ul>
                </div>
            </div>
            <div class="navbar-center">
                <a class="btn btn-ghost text-xl">CorpusHUB</a>
            </div>
            <div class="navbar-end">
                <button class="btn btn-ghost btn-circle">
                    <svg xmlns="http://www.w3.org/2000/svg" class="h-5 w-5" fill="none" viewBox="0 0 24 24"
                        stroke="currentColor">
                        <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                            d="M21 21l-6-6m2-5a7 7 0 11-14 0 7 7 0 0114 0z" />
                    </svg>
                </button>
                <button class="btn btn-ghost btn-circle">
                    <div class="indicator">
                        <svg xmlns="http://www.w3.org/2000/svg" class="h-5 w-5" fill="none" viewBox="0 0 24 24"
                            stroke="currentColor">
                            <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                                d="M15 17h5l-1.405-1.405A2.032 2.032 0 0118 14.158V11a6.002 6.002 0 00-4-5.659V5a2 2 0 10-4 0v.341C7.67 6.165 6 8.388 6 11v3.159c0 .538-.214 1.055-.595 1.436L4 17h5m6 0v1a3 3 0 11-6 0v-1m6 0H9" />
                        </svg>
                        <span class="badge badge-xs badge-primary indicator-item"></span>
                    </div>
                </button>
            </div>
        </div>
        <div class="main-content">
            <!-- 语料展示部分 -->
            <div class="flex w-full flex-col lg:flex-row">
                <!-- 左半边：精确搜索 -->
                <div class="badge badge-accent badge-outline badge-lg">Precise</div>
                <div>
                    <div class="overflow-x-auto">
                        <table class="table table-sm">
                            <thead>
                                <tr>
                                    <th></th>
                                    <th>Name</th>
                                    <th>Job</th>
                                    <th>company</th>
                                    <th>location</th>
                                    <th>Last Login</th>
                                    <th>Favorite Color</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <th>1</th>
                                    <td>Cy Ganderton</td>
                                    <td>Quality Control Specialist</td>
                                    <td>Littel, Schaden and Vandervort</td>
                                    <td>Canada</td>
                                    <td>12/16/2020</td>
                                    <td>Blue</td>
                                </tr>
                                <tr>
                                    <th>2</th>
                                    <td>Hart Hagerty</td>
                                    <td>Desktop Support Technician</td>
                                    <td>Zemlak, Daniel and Leannon</td>
                                    <td>United States</td>
                                    <td>12/5/2020</td>
                                    <td>Purple</td>
                                </tr>
                                <tr>
                                    <th>3</th>
                                    <td>Brice Swyre</td>
                                    <td>Tax Accountant</td>
                                    <td>Carroll Group</td>
                                    <td>China</td>
                                    <td>8/15/2020</td>
                                    <td>Red</td>
                                </tr>
                                <tr>
                                    <th>4</th>
                                    <td>Marjy Ferencz</td>
                                    <td>Office Assistant I</td>
                                    <td>Rowe-Schoen</td>
                                    <td>Russia</td>
                                    <td>3/25/2021</td>
                                    <td>Crimson</td>
                                </tr>
                                <tr>
                                    <th>5</th>
                                    <td>Yancy Tear</td>
                                    <td>Community Outreach Specialist</td>
                                    <td>Wyman-Ledner</td>
                                    <td>Brazil</td>
                                    <td>5/22/2020</td>
                                    <td>Indigo</td>
                                </tr>
                                <tr>
                                    <th>6</th>
                                    <td>Irma Vasilik</td>
                                    <td>Editor</td>
                                    <td>Wiza, Bins and Emard</td>
                                    <td>Venezuela</td>
                                    <td>12/8/2020</td>
                                    <td>Purple</td>
                                </tr>
                                <tr>
                                    <th>7</th>
                                    <td>Meghann Durtnal</td>
                                    <td>Staff Accountant IV</td>
                                    <td>Schuster-Schimmel</td>
                                    <td>Philippines</td>
                                    <td>2/17/2021</td>
                                    <td>Yellow</td>
                                </tr>
                                <tr>
                                    <th>8</th>
                                    <td>Sammy Seston</td>
                                    <td>Accountant I</td>
                                    <td>O'Hara, Welch and Keebler</td>
                                    <td>Indonesia</td>
                                    <td>5/23/2020</td>
                                    <td>Crimson</td>
                                </tr>
                                <tr>
                                    <th>9</th>
                                    <td>Lesya Tinham</td>
                                    <td>Safety Technician IV</td>
                                    <td>Turner-Kuhlman</td>
                                    <td>Philippines</td>
                                    <td>2/21/2021</td>
                                    <td>Maroon</td>
                                </tr>
                                <tr>
                                    <th>10</th>
                                    <td>Zaneta Tewkesbury</td>
                                    <td>VP Marketing</td>
                                    <td>Sauer LLC</td>
                                    <td>Chad</td>
                                    <td>6/23/2020</td>
                                    <td>Green</td>
                                </tr>
                                <tr>
                                    <th>11</th>
                                    <td>Andy Tipple</td>
                                    <td>Librarian</td>
                                    <td>Hilpert Group</td>
                                    <td>Poland</td>
                                    <td>7/9/2020</td>
                                    <td>Indigo</td>
                                </tr>
                                <tr>
                                    <th>12</th>
                                    <td>Sophi Biles</td>
                                    <td>Recruiting Manager</td>
                                    <td>Gutmann Inc</td>
                                    <td>Indonesia</td>
                                    <td>2/12/2021</td>
                                    <td>Maroon</td>
                                </tr>
                                <tr>
                                    <th>13</th>
                                    <td>Florida Garces</td>
                                    <td>Web Developer IV</td>
                                    <td>Gaylord, Pacocha and Baumbach</td>
                                    <td>Poland</td>
                                    <td>5/31/2020</td>
                                    <td>Purple</td>
                                </tr>
                                <tr>
                                    <th>14</th>
                                    <td>Maribeth Popping</td>
                                    <td>Analyst Programmer</td>
                                    <td>Deckow-Pouros</td>
                                    <td>Portugal</td>
                                    <td>4/27/2021</td>
                                    <td>Aquamarine</td>
                                </tr>
                                <tr>
                                    <th>15</th>
                                    <td>Moritz Dryburgh</td>
                                    <td>Dental Hygienist</td>
                                    <td>Schiller, Cole and Hackett</td>
                                    <td>Sri Lanka</td>
                                    <td>8/8/2020</td>
                                    <td>Crimson</td>
                                </tr>
                                <tr>
                                    <th>16</th>
                                    <td>Reid Semiras</td>
                                    <td>Teacher</td>
                                    <td>Sporer, Sipes and Rogahn</td>
                                    <td>Poland</td>
                                    <td>7/30/2020</td>
                                    <td>Green</td>
                                </tr>
                                <tr>
                                    <th>17</th>
                                    <td>Alec Lethby</td>
                                    <td>Teacher</td>
                                    <td>Reichel, Glover and Hamill</td>
                                    <td>China</td>
                                    <td>2/28/2021</td>
                                    <td>Khaki</td>
                                </tr>
                                <tr>
                                    <th>18</th>
                                    <td>Aland Wilber</td>
                                    <td>Quality Control Specialist</td>
                                    <td>Kshlerin, Rogahn and Swaniawski</td>
                                    <td>Czech Republic</td>
                                    <td>9/29/2020</td>
                                    <td>Purple</td>
                                </tr>
                                <tr>
                                    <th>19</th>
                                    <td>Teddie Duerden</td>
                                    <td>Staff Accountant III</td>
                                    <td>Pouros, Ullrich and Windler</td>
                                    <td>France</td>
                                    <td>10/27/2020</td>
                                    <td>Aquamarine</td>
                                </tr>
                                <tr>
                                    <th>20</th>
                                    <td>Lorelei Blackstone</td>
                                    <td>Data Coordiator</td>
                                    <td>Witting, Kutch and Greenfelder</td>
                                    <td>Kazakhstan</td>
                                    <td>6/3/2020</td>
                                    <td>Red</td>
                                </tr>
                            </tbody>
                            <tfoot>
                                <tr>
                                    <th></th>
                                    <th>Name</th>
                                    <th>Job</th>
                                    <th>company</th>
                                    <th>location</th>
                                    <th>Last Login</th>
                                    <th>Favorite Color</th>
                                </tr>
                            </tfoot>
                        </table>
                    </div>
                    <div class="join ">
                        <button class="join-item btn btn-md">1</button>
                        <button class="join-item btn btn-md btn-active">2</button>
                        <button class="join-item btn btn-md">3</button>
                        <button class="join-item btn btn-md">4</button>
                    </div>
                </div>
                <!-- 分界线 -->
                <div class="divider lg:divider-horizontal"></div>
                <!-- 右半边：模糊搜索 -->
                <div class="badge badge-accent badge-outline badge-lg">Vague</div>
                <div>
                    <div class="overflow-x-auto">
                        <table class="table table-sm">
                            <thead>
                                <tr>
                                    <th></th>
                                    <th>Name</th>
                                    <th>Job</th>
                                    <th>company</th>
                                    <th>location</th>
                                    <th>Last Login</th>
                                    <th>Favorite Color</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <th>1</th>
                                    <td>Cy Ganderton</td>
                                    <td>Quality Control Specialist</td>
                                    <td>Littel, Schaden and Vandervort</td>
                                    <td>Canada</td>
                                    <td>12/16/2020</td>
                                    <td>Blue</td>
                                </tr>
                                <tr>
                                    <th>2</th>
                                    <td>Hart Hagerty</td>
                                    <td>Desktop Support Technician</td>
                                    <td>Zemlak, Daniel and Leannon</td>
                                    <td>United States</td>
                                    <td>12/5/2020</td>
                                    <td>Purple</td>
                                </tr>
                                <tr>
                                    <th>3</th>
                                    <td>Brice Swyre</td>
                                    <td>Tax Accountant</td>
                                    <td>Carroll Group</td>
                                    <td>China</td>
                                    <td>8/15/2020</td>
                                    <td>Red</td>
                                </tr>
                                <tr>
                                    <th>4</th>
                                    <td>Marjy Ferencz</td>
                                    <td>Office Assistant I</td>
                                    <td>Rowe-Schoen</td>
                                    <td>Russia</td>
                                    <td>3/25/2021</td>
                                    <td>Crimson</td>
                                </tr>
                                <tr>
                                    <th>5</th>
                                    <td>Yancy Tear</td>
                                    <td>Community Outreach Specialist</td>
                                    <td>Wyman-Ledner</td>
                                    <td>Brazil</td>
                                    <td>5/22/2020</td>
                                    <td>Indigo</td>
                                </tr>
                                <tr>
                                    <th>6</th>
                                    <td>Irma Vasilik</td>
                                    <td>Editor</td>
                                    <td>Wiza, Bins and Emard</td>
                                    <td>Venezuela</td>
                                    <td>12/8/2020</td>
                                    <td>Purple</td>
                                </tr>
                                <tr>
                                    <th>7</th>
                                    <td>Meghann Durtnal</td>
                                    <td>Staff Accountant IV</td>
                                    <td>Schuster-Schimmel</td>
                                    <td>Philippines</td>
                                    <td>2/17/2021</td>
                                    <td>Yellow</td>
                                </tr>
                                <tr>
                                    <th>8</th>
                                    <td>Sammy Seston</td>
                                    <td>Accountant I</td>
                                    <td>O'Hara, Welch and Keebler</td>
                                    <td>Indonesia</td>
                                    <td>5/23/2020</td>
                                    <td>Crimson</td>
                                </tr>
                                <tr>
                                    <th>9</th>
                                    <td>Lesya Tinham</td>
                                    <td>Safety Technician IV</td>
                                    <td>Turner-Kuhlman</td>
                                    <td>Philippines</td>
                                    <td>2/21/2021</td>
                                    <td>Maroon</td>
                                </tr>
                                <tr>
                                    <th>10</th>
                                    <td>Zaneta Tewkesbury</td>
                                    <td>VP Marketing</td>
                                    <td>Sauer LLC</td>
                                    <td>Chad</td>
                                    <td>6/23/2020</td>
                                    <td>Green</td>
                                </tr>
                                <tr>
                                    <th>11</th>
                                    <td>Andy Tipple</td>
                                    <td>Librarian</td>
                                    <td>Hilpert Group</td>
                                    <td>Poland</td>
                                    <td>7/9/2020</td>
                                    <td>Indigo</td>
                                </tr>
                                <tr>
                                    <th>12</th>
                                    <td>Sophi Biles</td>
                                    <td>Recruiting Manager</td>
                                    <td>Gutmann Inc</td>
                                    <td>Indonesia</td>
                                    <td>2/12/2021</td>
                                    <td>Maroon</td>
                                </tr>
                                <tr>
                                    <th>13</th>
                                    <td>Florida Garces</td>
                                    <td>Web Developer IV</td>
                                    <td>Gaylord, Pacocha and Baumbach</td>
                                    <td>Poland</td>
                                    <td>5/31/2020</td>
                                    <td>Purple</td>
                                </tr>
                                <tr>
                                    <th>14</th>
                                    <td>Maribeth Popping</td>
                                    <td>Analyst Programmer</td>
                                    <td>Deckow-Pouros</td>
                                    <td>Portugal</td>
                                    <td>4/27/2021</td>
                                    <td>Aquamarine</td>
                                </tr>
                                <tr>
                                    <th>15</th>
                                    <td>Moritz Dryburgh</td>
                                    <td>Dental Hygienist</td>
                                    <td>Schiller, Cole and Hackett</td>
                                    <td>Sri Lanka</td>
                                    <td>8/8/2020</td>
                                    <td>Crimson</td>
                                </tr>
                                <tr>
                                    <th>16</th>
                                    <td>Reid Semiras</td>
                                    <td>Teacher</td>
                                    <td>Sporer, Sipes and Rogahn</td>
                                    <td>Poland</td>
                                    <td>7/30/2020</td>
                                    <td>Green</td>
                                </tr>
                                <tr>
                                    <th>17</th>
                                    <td>Alec Lethby</td>
                                    <td>Teacher</td>
                                    <td>Reichel, Glover and Hamill</td>
                                    <td>China</td>
                                    <td>2/28/2021</td>
                                    <td>Khaki</td>
                                </tr>
                                <tr>
                                    <th>18</th>
                                    <td>Aland Wilber</td>
                                    <td>Quality Control Specialist</td>
                                    <td>Kshlerin, Rogahn and Swaniawski</td>
                                    <td>Czech Republic</td>
                                    <td>9/29/2020</td>
                                    <td>Purple</td>
                                </tr>
                                <tr>
                                    <th>19</th>
                                    <td>Teddie Duerden</td>
                                    <td>Staff Accountant III</td>
                                    <td>Pouros, Ullrich and Windler</td>
                                    <td>France</td>
                                    <td>10/27/2020</td>
                                    <td>Aquamarine</td>
                                </tr>
                                <tr>
                                    <th>20</th>
                                    <td>Lorelei Blackstone</td>
                                    <td>Data Coordiator</td>
                                    <td>Witting, Kutch and Greenfelder</td>
                                    <td>Kazakhstan</td>
                                    <td>6/3/2020</td>
                                    <td>Red</td>
                                </tr>
                            </tbody>
                            <tfoot>
                                <tr>
                                    <th></th>
                                    <th>Name</th>
                                    <th>Job</th>
                                    <th>company</th>
                                    <th>location</th>
                                    <th>Last Login</th>
                                    <th>Favorite Color</th>
                                </tr>
                            </tfoot>
                        </table>
                    </div>
                    <div class="join ">
                        <button class="join-item btn btn-md">1</button>
                        <button class="join-item btn btn-md btn-active">2</button>
                        <button class="join-item btn btn-md">3</button>
                        <button class="join-item btn btn-md">4</button>
                    </div>
                </div>
            </div>
        </div>

        <footer class="footer bg-base-200 text-base-content p-10">
            <aside>
                <svg width="50" height="50" viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg" fill-rule="evenodd"
                    clip-rule="evenodd" class="fill-current">
                    <path
                        d="M22.672 15.226l-2.432.811.841 2.515c.33 1.019-.209 2.127-1.23 2.456-1.15.325-2.148-.321-2.463-1.226l-.84-2.518-5.013 1.677.84 2.517c.391 1.203-.434 2.542-1.831 2.542-.88 0-1.601-.564-1.86-1.314l-.842-2.516-2.431.809c-1.135.328-2.145-.317-2.463-1.229-.329-1.018.211-2.127 1.231-2.456l2.432-.809-1.621-4.823-2.432.808c-1.355.384-2.558-.59-2.558-1.839 0-.817.509-1.582 1.327-1.846l2.433-.809-.842-2.515c-.33-1.02.211-2.129 1.232-2.458 1.02-.329 2.13.209 2.461 1.229l.842 2.515 5.011-1.677-.839-2.517c-.403-1.238.484-2.553 1.843-2.553.819 0 1.585.509 1.85 1.326l.841 2.517 2.431-.81c1.02-.33 2.131.211 2.461 1.229.332 1.018-.21 2.126-1.23 2.456l-2.433.809 1.622 4.823 2.433-.809c1.242-.401 2.557.484 2.557 1.838 0 .819-.51 1.583-1.328 1.847m-8.992-6.428l-5.01 1.675 1.619 4.828 5.011-1.674-1.62-4.829z">
                    </path>
                </svg>
                <p>
                    ACME Industries Ltd.
                    <br />
                    Providing reliable tech since 1992
                </p>
            </aside>
            <nav>
                <h6 class="footer-title">Services</h6>
                <a class="link link-hover">Branding</a>
                <a class="link link-hover">Design</a>
                <a class="link link-hover">Marketing</a>
                <a class="link link-hover">Advertisement</a>
            </nav>
            <nav>
                <h6 class="footer-title">Company</h6>
                <a class="link link-hover">About us</a>
                <a class="link link-hover">Contact</a>
                <a class="link link-hover">Jobs</a>
                <a class="link link-hover">Press kit</a>
            </nav>
            <nav>
                <h6 class="footer-title">Legal</h6>
                <a class="link link-hover">Terms of use</a>
                <a class="link link-hover">Privacy policy</a>
                <a class="link link-hover">Cookie policy</a>
            </nav>
        </footer>
    </div>
</template>

<script setup name="SearchPage" >
import{ref} from 'vue'

</script>

<style scoped>






</style>