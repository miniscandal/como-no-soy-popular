
# En "Sword Art Online: Alicization", los "System Call" son comandos que los personajes
# pueden usar para activar funciones dentro del mundo virtual "Underworld". Estos comandos
# están diseñados para permitir a los jugadores o a los administradores ejecutar acciones.

function System-Call {
    param(
        [string]$Command
    )

    $sword = @"
                 __
                \  /
                    \\
                    \\
    ___________________||/\_
    (___________________()| _||||||||||||||||||||||||||||||||||||||||||>
                        ||\/
                    //
                    //
                /__\
"@

    Write-Output ""
    if (-not ($Command -eq "Redefinition Object, Sword Class")) {
        Write-Output "Command Error"
        Write-Output ""
        [System.Media.SystemSounds]::Hand.Play()

        return
    }

    Write-Output $sword
    Write-Output ""
}

New-Alias -Name sc -Value System-Call
