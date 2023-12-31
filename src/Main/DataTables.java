package Main;

public class DataTables {

     final double[][] saturatedStateR1234YF =      //6x3 - Liquid: 0.Pressure, 1.PhaseChange Temp, 2.Density, 3.Enthalpy -- Vapor: 4.Density, 5.Enthalpy

            //  0    1       2       3       4        5
           {{0.37, -50,  1.318, 139.63,  2.355,  329.85},    // 0
            {0.49, -45,  1.305, 145.31,  3.007,  333.21},    // 1
            {0.62, -40,  1.292, 151.07,  3.795,  336.58},    // 2
            {0.79, -35,  1.278, 156.90,  4.373,  339.95},    // 3
            {0.99, -30,  1.265, 162.81,  5.855,  343.32},    // 4
            {1.23, -25,  1.251, 168.80,  7.171,  346.69},    // 5
            {1.51, -20,  1.236, 174.87,  8.709,  350.05},    // 6
            {1.84, -15,  1.222, 181.02,  10.496, 353.40},    // 7
            {2.22, -10,  1.207, 187.26,  12.559, 356.72},    // 8
            {2.66,  -5,  1.192, 193.59,  14.931, 360.02},    // 9
            {3.16,   0,  1.176, 200.00,  17.647, 363.29},    // 10
            {3.73,   5,  1.160, 206.50,  20.744, 366.52},    // 11
            {4.38,  10,  1.144, 213.10,  24.267, 369.70},    // 12
            {5.10,  15,  1.127, 219.80,  28.266, 372.83},    // 13
            {5.92,  20,  1.110, 226.60,  32.796, 375.89},    // 14
            {6.83,  25,  1.092, 233.50,  37.925, 378.87},    // 15
            {7.84,  30,  1.073, 240.51,  43.729, 381.75},    // 16
            {8.95,  35,  1.054, 247.64,  50.301, 384.52},    // 17
            {10.18, 40,  1.034, 254.90,  57.753, 387.17},    // 18
            {11.54, 45,  1.013, 262.30,  66.223, 389.66},    // 19
            {13.02, 50,  0.990, 269.85,  75.884, 391.98},    // 20
            {14.65, 55,  0.967, 277.58,  86.961, 394.08},    // 21
            {16.42, 60,  0.941, 285.53,  99.754, 395.93},    // 22
            {18.35, 65,  0.914, 293.72, 114.676, 397.46},    // 23
            {20.45, 70,  0.883, 302.22, 132.332, 398.57},    // 24
            {22.72, 75,  0.849, 311.11, 153.671, 399.13},    // 25
            {25.19, 80,  0.809, 320.54, 180.333, 398.90},    // 26
            {27.88, 85,  0.760, 330.81, 215.673, 397.40},    // 27
            {30.80, 90,  0.694, 342.79, 269.099, 393.32},    // 28
            {33.82, 94.7,2.080, 368.98, 475.553, 369.55}};   // 29


    final double[][] superheatedVaporR1234YF_enthalpy =   // 8x31 - vapor: 0.Pressure, 1.Temperature

                     // 0    1       2      3      4      5      6      7
                   {{  99,   0,      5,    10,    15,    20,    25,    30},    // 0
                    {0.37,  329.9, 333.6, 337.4, 341.3, 345.2, 349.2, 353.2},  // 1
                    {0.46,  333.2, 337.0, 340.9, 344.9, 348.8, 352.9, 357.0},  // 2
                    {0.62,  336.6, 340.5, 344.4, 348.5, 352.5, 356.6, 360.8},  // 3
                    {0.79,  339.9, 343.9, 348.0, 352.1, 356.2, 360.4, 364.6},  // 4
                    {0.99,  343.3, 347.4, 351.5, 355.7, 359.9, 364.1, 368.4},  // 5
                    {1.23,  346.7, 350.9, 355.1, 363.6, 367.9, 372.2, 372.2},  // 6
                    {1.51,  350.1, 354.3, 358.6, 362.9, 367.3, 371.6, 376.1},  // 7
                    {1.84,  353.4, 357.7, 362.1, 366.5, 370.9, 375.4, 379.9},  // 8
                    {2.22,  356.7, 361.2, 365.6, 370.1, 374.6, 379.2, 383.7},  // 9
                    {2.66,  360.0, 364.6, 369.1, 373.7, 378.3, 382.9, 387.6},  // 10
                    {3.16,  363.3, 367.9, 372.6, 377.2, 381.9, 386.6, 391.4},  // 11
                    {3.73,  366.5, 371.3, 376.0, 380.8, 385.6, 390.4, 395.2},  // 12
                    {4.38,  369.7, 374.6, 379.4, 384.3, 389.2, 394.0, 398.9},  // 13
                    {5.10,  372.8, 377.8, 382.8, 387.7, 392.7, 397.7, 402.7},  // 14
                    {5.92,  375.9, 381.0, 386.1, 391.2, 396.2, 401.3, 406.4},  // 15
                    {6.83,  378.9, 384.1, 389.3, 394.5, 399.7, 404.9, 410.1},  // 16
                    {7.84,  381.8, 387.2, 392.5, 397.8, 403.1, 408.4, 413.7},  // 17
                    {8.95,  384.5, 390.1, 395.6, 401.1, 406.5, 411.9, 417.3},  // 18
                    {10.18, 387.2, 392.9, 398.6, 404.2, 409.8, 415.3, 420.8},  // 19
                    {11.54, 389.7, 395.7, 401.5, 407.3, 413.0, 418.7, 424.3},  // 20
                    {13.02, 392.0, 398.2, 404.3, 410.3, 416.1, 421.9, 427.7},  // 21
                    {14.65, 394.1, 400.7, 413.1, 419.2, 425.1, 431.0, 442.6},  // 22
                    {16.42, 395.9, 402.9, 409.5, 415.9, 422.1, 428.2, 434.2},  // 23
                    {18.35, 397.5, 404.9, 411.8, 418.5, 424.9, 431.2, 437.4},  // 24
                    {20.45, 398.6, 406.6, 414.0, 420.9, 427.6, 434.1, 440.4},  // 25
                    {22.72, 408.0, 399.1, 415.9, 423.1, 430.1, 436.8, 443.4},  // 26
                    {25.19, 398.9, 409.0, 417.5, 425.2, 432.4, 439.4, 446.2},  // 27
                    {27.88, 397.4, 409.6, 418.8, 427.0, 434.6, 441.9, 448.9},  // 28
                    {30.80, 393.3, 409.4, 419.8, 428.5, 436.6, 444.1, 451.4},  // 29
                    {33.82, 370.1, 408.5, 420.2, 429.7, 438.1, 446.1, 453.6}}; // 30
    }





