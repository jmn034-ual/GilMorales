import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-lista-publicaciones-usuario-no-registrado-item')
export class VistaListaPublicacionesUsuarioNoRegistradoItem extends LitElement {
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
<vaadin-horizontal-layout class="content" style="margin: var(--lumo-space-m);" id="layoutPublicacion">
 <vaadin-vertical-layout id="vaadinVerticalLayout">
  <vaadin-vertical-layout theme="spacing" id="fotoPerfil"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout id="layoutVideoPublicacion" style="flex-grow: 1;">
  <vaadin-button theme="tertiary" id="botonNombreUsuario">
    NombreUsuario 
  </vaadin-button>
  <label id="labelGeolocalizacion">Geolocalización</label>
  <vaadin-vertical-layout theme="spacing" id="layoutVideo" style="align-self: stretch; margin: var(--lumo-space-xs); flex-grow: 1;"></vaadin-vertical-layout>
  <label id="numVisualizaciones">0</label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout id="layoutDatos">
  <vaadin-horizontal-layout theme="spacing" id="layoutBotonesUsuarioR" style="align-self: stretch; justify-content: flex-end;">
   <vaadin-button id="botonSeguir">
     Seguir 
   </vaadin-button>
   <vaadin-button id="botonDenunciar">
     Denunciar 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="layoutBotonesPublicacion" style="align-self: center;">
   <vaadin-vertical-layout theme="spacing" id="layoutMeGustas">
    <label id="labelNumMeGustas" style="align-self: center;">0</label>
    <label id="labelMeGustas" style="align-self: center;">Numero Me Gustas</label>
    <vaadin-button id="vaadinButton" style="align-self: center;">
      Me Gusta 
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" id="layoutComentarios">
    <label id="labelNumComentarios" style="align-self: center;">0</label>
    <vaadin-button id="botonVerComentarios" style="align-self: center;">
      Ver Comentarios 
    </vaadin-button>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <label id="labelDescripcion" style="flex-grow: 1; align-self: stretch;">Descripción de la publicación...</label>
  <vaadin-horizontal-layout theme="spacing-xs" id="layoutComentar" style="align-self: stretch;">
   <vaadin-text-field label="" placeholder="Escribe tu comentario..." id="textFieldComentario"></vaadin-text-field>
   <vaadin-button id="botonComentar">
     Comentar 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
