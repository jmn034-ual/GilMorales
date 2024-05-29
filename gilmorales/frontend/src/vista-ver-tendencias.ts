import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-avatar/src/vaadin-avatar.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

@customElement('vista-ver-tendencias')
export class VistaVerTendencias extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-horizontal-layout id="vaadinHorizontalLayout" style="flex-shrink: 0; overflow-y: auto; height: 100%; scrollbar-width: thin; scrollbar-color: transparent transparent; width: 100%;">
 <vaadin-vertical-layout style="flex-shrink: 0; flex-grow: 0; align-items: center; z-index: 999; height: 100%; justify-content: flex-start; overflow-y: auto; scrollbar-color: transparent transparent; background-color: #C8C4C4; padding: var(--lumo-space-m);" id="layoutTendencias" theme="spacing-xs">
  <h4 id="tituloTendencias" style="align-self: center; margin-bottom: 0px; margin-top: 0px; padding-top: var(--lumo-space-m);">Tendencias </h4>
  <vaadin-vertical-layout id="layoutHashtags" style="flex-grow: 0; align-self: center; align-items: center; flex-shrink: 0; justify-content: flex-start; margin-top: 0%; padding: 0%;"></vaadin-vertical-layout>
  <vaadin-button id="botonVerListaHashtags" style="align-self: center;">
   Lista Hashtags
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout id="vaadinVerticalLayout1" style="flex-grow: 0; height: 100%; flex-shrink: 0; overflow-y: auto; scrollbar-width: thin; scrollbar-color: transparent transparent; padding-bottom: var(--lumo-space-xl); width: 88%;">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="flex-grow: 0; flex-shrink: 0; padding-top: 3%; width: 100%; justify-content: flex-start; align-self: stretch;">
   <vaadin-vertical-layout theme="spacing" id="fotoPerfil">
    <vaadin-avatar id="fotoPerfil1" style="width: 150px; height: 150px;"></vaadin-avatar>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing-xs" id="vaadinVerticalLayout2" style="justify-content: flex-start; align-items: flex-start;">
    <h3 id="nombreUsuario" style="margin: var(--lumo-space-xs);">NombreUsuario</h3>
    <h4 style="align-self: flex-start; margin: var(--lumo-space-xs);" id="nombreYapellidos">Nombre y Apellidos</h4>
    <vaadin-button id="botonSeguir" style="align-self: flex-start;">
      Seguir 
    </vaadin-button>
    <vaadin-button theme="icon" aria-label="Add new" id="botonEditarPerfil">
     <iron-icon icon="lumo:edit"></iron-icon>
    </vaadin-button>
    <vaadin-button id="botonPeticionAmistad">
      Enviar Petición de Amistad 
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout id="vaadinVerticalLayout3" style="flex-grow: 1; flex-shrink: 0;">
    <vaadin-button id="botonBloquear" style="align-self: flex-end; margin: var(--lumo-space-xs);">
      Bloquear 
    </vaadin-button>
    <vaadin-button id="botonDenunciar" style="align-self: flex-end; margin: var(--lumo-space-xs);">
      Denunciar 
    </vaadin-button>
    <vaadin-button theme="icon" aria-label="Add new" id="botonModificarPerfil" style="align-self: flex-end; margin: var(--lumo-space-xs);">
     <iron-icon icon="lumo:cog"></iron-icon>
    </vaadin-button>
    <vaadin-button id="botonEliminarPublicacion" style="align-self: flex-end; margin: var(--lumo-space-xs);">
      Eliminar Publicación 
    </vaadin-button>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="layoutDatosPerfil" style="margin: var(--lumo-space-xs); align-items: center;">
   <label id="numSiguiendo">0</label>
   <vaadin-button id="verSiguiendos">
     Siguiendo 
   </vaadin-button>
   <label id="labelSiguiendo">Siguiendo</label>
   <label id="numSeguidores">0</label>
   <vaadin-button id="verSeguidores">
     Seguidores 
   </vaadin-button>
   <label id="labelSeguidores">Seguidores</label>
   <label id="numMeGustas">0</label>
   <label id="labelMeGustas">Me Gustas</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="layoutDescripcion" style="margin: var(--lumo-space-xs);">
   <label id="labelDescripcion" style="flex-grow: 0; flex-shrink: 0;">Descripción sobre el perfil del usuario.</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" id="layoutBonoes" style="margin: var(--lumo-space-s);">
   <vaadin-button id="botonVideos">
     Videos 
   </vaadin-button>
   <vaadin-button id="botonMeGustas">
     Me Gustas 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <hr style="width: 98%; align-self: center; padding-bottom: 0.1%;" id="barraHorizontal">
  <label id="labelUsuarioPrivado" style="align-self: center;">Perfil privado, para ver sus videos envíe una petición de amistad.</label>
  <vaadin-vertical-layout theme="spacing" id="listaMeGustas" style="flex-grow: 0; overflow-y: auto; flex-shrink: 0; align-self: center;"></vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="layoutListaPublicaciones" style="flex-grow: 0; overflow-y: auto; flex-shrink: 0; align-self: center;"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
