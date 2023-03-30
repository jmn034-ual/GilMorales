import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

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
<vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout" style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout id="layoutCabecera" style="width: 100%;"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%; height: 100%;">
  <vaadin-vertical-layout style="flex-grow: 0; flex-shrink: 1;" id="layoutTendencias">
   <h4 id="tituloTendencias" style="align-self: center;">Tendencias </h4>
   <vaadin-vertical-layout id="layoutHashtags" style="flex-grow: 1; align-self: center;"></vaadin-vertical-layout>
   <vaadin-button id="botonVerListaHashtags" style="align-self: center; margin: var(--lumo-space-s);">
    Ver Lista Hashtags
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="flex-grow: 1; margin: var(--lumo-space-s);">
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 100%;">
    <vaadin-vertical-layout theme="spacing" id="fotoPerfil"></vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing-xs" id="vaadinVerticalLayout2" style="justify-content: flex-start; align-items: flex-start;">
     <h3 id="nombreUsuario" style="margin: var(--lumo-space-xs);">NombreUsuario</h3>
     <h4 style="align-self: flex-start; margin: var(--lumo-space-xs);" id="nombreYapellidos">Nombre y Apellidos</h4>
     <vaadin-button id="botonSeguir" style="align-self: flex-start;">
      Seguir
     </vaadin-button>
     <vaadin-button id="botonEditarPerfil">
      Editar Perfil
     </vaadin-button>
     <vaadin-button id="botonPeticionAmistad">
      Enviar Petición de Amistad
     </vaadin-button>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing-xs" id="vaadinVerticalLayout3" style="flex-grow: 1; margin: var(--lumo-space-xs);">
     <vaadin-button id="botonDenunciar" style="align-self: flex-end; margin: var(--lumo-space-xs);">
      Denunciar
     </vaadin-button>
     <vaadin-button id="botonModificarPerfil" style="align-self: flex-end; margin: var(--lumo-space-xs);">
      Modificar Perfil
     </vaadin-button>
     <vaadin-button id="botonEliminarPublicacion" style="align-self: flex-end; margin: var(--lumo-space-xs);">
      Eliminar Publicación
     </vaadin-button>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" id="layoutDatosPerfil" style="width: 100%; margin: var(--lumo-space-xs);">
    <label id="numSiguiendo">0</label>
    <label id="labelSiguiendo">Siguiendo</label>
    <label id="numSeguidores">0</label>
    <label id="labelSeguidores">Seguidores</label>
    <label id="numMeGustas">0</label>
    <label id="labelMeGustas">Me Gustas</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" id="layoutDescripcion" style="width: 100%; margin: var(--lumo-space-xs);">
    <label id="labelDescripcion" style="flex-grow: 0;">Descripción sobre el perfil del usuario.</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing-xl" id="layoutBonoes" style="margin: var(--lumo-space-s);">
    <vaadin-button id="botonVideos">
     Videos
    </vaadin-button>
    <vaadin-button id="botonMeGustas">
     Me Gustas
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-vertical-layout theme="spacing" id="layoutListaPublicaciones" style="flex-grow: 1; width: 100%;">
    <vaadin-horizontal-layout theme="spacing" id="layoutHorizontalPublicaciones" style="width: 100%;"></vaadin-horizontal-layout>
    <label id="labelUsuarioPrivado" style="align-self: center;">Perfil privado, para ver sus videos envíe una petición de amistad.</label>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
