import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-lista-publicaciones-administrador-item')
export class VistaListaPublicacionesAdministradorItem extends LitElement {
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
<vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout" style="width: 100%; height: 100%; min-height: 100%; min-width: 100%;">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3" style="height: 100%; width: 100%; padding: 10px; min-width: 100%;">
  <vaadin-vertical-layout id="vaadinVerticalLayout">
   <vaadin-vertical-layout theme="spacing-s" id="fotoPerfil">
    <vaadin-avatar id="vaadinAvatar"></vaadin-avatar>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="layoutVideoPublicacion" style="flex-grow: 0; flex-shrink: 0; width: 1000px;">
   <vaadin-button theme="tertiary" id="botonNombreUsuario">
     NombreUsuario 
   </vaadin-button>
   <label id="labelGeolocalizacion">Geolocalización</label>
   <label id="numVisualizaciones" style="align-self: flex-end; padding-right: var(--lumo-space-xl);">0</label>
   <vaadin-vertical-layout id="layoutVideo" style="align-self: center; flex-grow: 0; flex-shrink: 0; width: 1000px; display: flex; justify-content: center; align-items: center; overflow: hidden; height: 700px; background-color: black;"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="layoutDatos" style="justify-content: center; flex-grow: 0; flex-shrink: 0;">
   <vaadin-horizontal-layout theme="spacing" id="layoutBotonesUsuarioR" style="align-self: flex-end; justify-content: flex-end;">
    <vaadin-button id="botonEliminar">
      Eliminar 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing-xl" id="layoutBotonesPublicacion" style="align-self: center; justify-content: center;">
    <vaadin-vertical-layout theme="spacing" id="layoutMeGustas">
     <label id="labelNumMeGustas" style="align-self: center;">0</label>
     <label id="labelMeGustas" style="align-self: center;">Numero Me Gustas</label>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" id="layoutComentarios">
     <label id="labelNumComentarios" style="align-self: center;">0</label>
     <vaadin-button id="botonVerComentarios" style="align-self: center;">
       Ver Comentarios 
     </vaadin-button>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <hr id="lineaHorizontal" style="width: 99%; height: 2px;">
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}